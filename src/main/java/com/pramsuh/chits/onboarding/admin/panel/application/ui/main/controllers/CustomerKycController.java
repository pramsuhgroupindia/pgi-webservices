package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Customer;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.SignupDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.CustomerRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.SignupDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
@RestController
@RequestMapping("/api/v1/web/services/customer/signup/kyc/process")
public class CustomerKycController {
    @Autowired
    SignupDetailsRepository signupDetailsRepository;

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping(consumes={"multipart/form-data"})
    public ResponseEntity<Customer> uploadKycDetails(@RequestBody SignupDetails registeredCustomer,
                                                     @RequestParam("AADHAR") MultipartFile multipartFile1,
                                                     @RequestParam("PAN") MultipartFile multipartFile2,
                                                     @RequestParam("ADDRESS") MultipartFile multipartFile3) throws IOException {
        if (registeredCustomer.getAadharNumber().equalsIgnoreCase(signupDetailsRepository.findProfileByAadharNumber(registeredCustomer.getAadharNumber()).get().getAadharNumber())) {
            String aadharcardphoto = StringUtils.cleanPath(multipartFile1.getOriginalFilename());
            String pancardphoto = StringUtils.cleanPath(multipartFile2.getOriginalFilename());
            String addressphoto = StringUtils.cleanPath(multipartFile3.getOriginalFilename());
            SignupDetails newDetails = new SignupDetails();
            newDetails.setFullName(registeredCustomer.getFullName());
            newDetails.setMobileNumber(registeredCustomer.getMobileNumber());
            newDetails.setEmailId(registeredCustomer.getEmailId());
            newDetails.setAddress(registeredCustomer.getAddress());
            newDetails.setAadharNumber(registeredCustomer.getAadharNumber());
            newDetails.setPanNumber(registeredCustomer.getPanNumber());
            newDetails.setPassword(registeredCustomer.getPassword());
            newDetails.setConfirmPassword(registeredCustomer.getConfirmPassword());
            newDetails.setAadharCard(aadharcardphoto);
            newDetails.setPanCard(pancardphoto);
            newDetails.setAddressCard(addressphoto);
            signupDetailsRepository.delete(registeredCustomer);
            newDetails = signupDetailsRepository.save(newDetails);
            String uploadDir = "kyc/" + newDetails.getMobileNumber()+"/";
            saveFile(uploadDir, aadharcardphoto, multipartFile1);
            saveFile(uploadDir, pancardphoto, multipartFile2);
            saveFile(uploadDir, addressphoto, multipartFile3);
            if (!customerRepository.findProfileByaadharNumber(newDetails.getMobileNumber()).isPresent()) {
                Customer customer = new Customer();
                customer.setCustomerName(newDetails.getFullName());
                customer.setMobileNumber(newDetails.getMobileNumber());
                customer.setPassword(newDetails.getPassword());
                customer.setMessage("KYC COMPLETED");
                customerRepository.save(customer);
                return ResponseEntity.ok(customer);
            }
        }
        Customer customer1 = new Customer();
        customer1.setMessage("KYC FAILED");
        customer1.setMobileNumber("0000000000");
        customer1.setPassword("123456");
        return ResponseEntity.ok(customer1);
    }

    public static void saveFile(String uploadDir, String fileName,
                                MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
    }

}
