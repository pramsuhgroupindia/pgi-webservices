package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.mocking;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.QuestionsAnswers;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.QuestionsAnswersRepository;

public class QuestionAnswerMocker {

    public void mockQuestionAnswers(QuestionsAnswersRepository questionsAnswersRepository){
        QuestionsAnswers faq1 = new QuestionsAnswers();
        faq1.setQuestion("What is Chit Fund?");
        faq1.setAnswer("It is a CONTRACT between the foreman, as the Promoter is called, and the subscribers, who join voluntarily. It is a FINANCIAL SYSTEM under which the periodical and regular savings of a group of subscribers are made available to each subscriber, a SPECIFIED AMOUNT every month (instalment) for a SPECIFIED PERIOD." +
                "The Pooled funds every month are offered to the subscribers at monthly AUCTIONS and the subscriber who BIDS for the highest DISCOUNT is declared the PRIZE WINNER and given the PRIZE AMOUNT on proper security. A Prized subscriber also should continue to pay the subscriptions till the termination of the chit. The amount foregone as discount, less foreman�s commission is distributed among the subscribers as dividend.");
        faq1.setNumber("1");
        QuestionsAnswers faq2 = new QuestionsAnswers();
        faq2.setQuestion("How does a chit operate?");
        faq2.setAnswer("Chit is a mutually beneficial scheme where in a group of people contribute towards the chit value and one member from the group is given the prize amount and the dividends are distributed to all the other members. For Example if we consider a chit value of Rs.100000/- with 50 members in the group each member has to contribute Rs.2000/- where by (50 X 2000) Rs.100000/- is collected." +
                "The auction is conducted in which the members participate and the person who discounts the maximum is declared as the prized subscriber. If there are more than one participant for maximum discount the Successful Bidder will be determined by way of lottery. Where in, the tokens bearing the numbers allotted to the members is put into a box and one token is drawn by any of the member present in the auction and thus, the member whose number is mention on the drawn token will be declared as the Successful Bidder." +
                "40% is the maximum bid allowed, which means a person foregoes Rs.40000/- and the balance Rs.60000/- is paid to the prized subscribers. Out of 40% discount 5% goes to the company towards company's commission for conducting the chit and balance of the discount amount is distributed equally amongst all members of the group. That is 35 % is distributed to all the members by which next month they have to contribute (Rs.2000/- - Rs.700/-) = Rs.1300/- only and Rs.700/- is declared as dividend for that month." +
                "When there are no maximum bidders, then the members will bid in the open auction that is conducted within 5 minutes for each group and the person who bids the highest is declared as Successful Bidder. For Example: Suppose, in the 10th month the Successful Bidder was declared at 35%, then all members of the group will get a dividend of Rs.600/-each i.e. (Rs30000/-divided among 50 members) and each member has to pay Rs.1400/- towards Installment." +
                "Therefore the members have to pay the installment amount less the dividend, the dividends earned workout to be the interest on the Installment payments made by the member. Successful Bidder is supposed to give the required sureties depending on the future liability of the chit. Only Non-Prized Subscribers whose payments are up to date can participate in the auctions." +
                "Every month there is a Successful Bidder who gets his prized amount on submission of required Guarantors. The prized subscriber has to continue to pay the monthly installments till the termination of the chit." +
                "Those members who do not want to draw the chit can contribute to the chit and after the 40th month if there are no bidders for the auction, the auction is decided by lot among the Non Prized Subscribers and the Successful Bidder is paid the Prize Amount. They either have options to submit sureties or prefer Future liability deducted upon which balance amount is paid from the Prized amount. The dividend accrued for the 50 months are the returns on investment for the monthly deposit are made to their accounts.");
        faq2.setNumber("2");
        QuestionsAnswers faq3 = new QuestionsAnswers();
        faq3.setQuestion("What are the benefits of a chit fund?");
        faq3.setAnswer("Chit fund is a unique financial concept, which has flexibility to borrow or save. By paying one-month installment amount, a person can get to borrow from the chit value, by offering a discount not exceeding the maximum limit ascertained in the chit agreement." +
                "In a chit value of Rs.100000/- for a period of 50 months, first the subscriber can get an amount of 60000/-by paying only Rs.2000/- and remaining installments he pays over a period of 50 months. The rate of borrowing is much cheaper than several other financial schemes." +
                "The non prized subscriber who is a saving member upto the last installments gets dividend which is comparatively higher than the interest that are accrued by way of Recurring Deposit Schemes." +
                "The purpose of drawing the prized amount need not be disclosed. It can be used for any need by the member for Example: House construction, Marriage, Education, Expansion of business, buy a Computer or any other purpose at his discretion.");
        faq3.setNumber("3");
        QuestionsAnswers faq4 = new QuestionsAnswers();
        faq4.setQuestion("Why should I prefer Pramsuh Chits to other chit fund companies ?");
        faq4.setAnswer("Pramsuh Chits is highly conscious about the quality of membership by screening every enrollment form that is received and only if the financial capacity seems to be satisfactory, we approve the enrollment. We have an excellent track record of 99% recovery, which is a key to any successful financial company. Good recovery is possible only with qualitative members. Most importantly Pramsuh Chits has earned great reputation for best and timely payments of prize money. We are eager to make the payment to the members since a satisfied member gives us more business. We are very keen in proper sureties/Guarantors for the future liability of a prize subscriber since we have to protect the interest of the saving members (i.e. Non Prized Subscribers).");
        faq4.setNumber("4");
        QuestionsAnswers faq5 = new QuestionsAnswers();
        faq5.setQuestion("What are the various chit groups available in Pramsuh Chits?");
        faq5.setAnswer("Mardadarsi chit fund is having a vide range of chit groups available which suits all walks of people for Example: Individual, Employee, Professionals, Agriculturists, Land Lords, Proprietors, Partnership firms, companies, corporate offices, Organization etc., It has a vide range of Chit values starting from Rs.25,000/- to a maximum range of Rs.50,00,000/-." );
        faq5.setNumber("5");
        QuestionsAnswers faq6 = new QuestionsAnswers();
        faq6.setQuestion("What is the duration of these chits?");
        faq6.setAnswer("Pramsuh Chits is having various range of chit duration. They are 50 months (Long Term), 40 months (Forty Term), 30 months (Thirty Term), and 25 months (Short Term), groups with 50,40,30 and 25 members respectively forming the group.");
        faq6.setNumber("6");
        QuestionsAnswers faq7 = new QuestionsAnswers();
        faq7.setQuestion("How many chits can I take in a chit group?");
        faq7.setAnswer("A person cannot take more than 2 (Two) chits in a group that too he should have paying capacity for the same.");
        faq7.setNumber("7");
        QuestionsAnswers faq8 = new QuestionsAnswers();
        faq8.setQuestion("What are the modes of payment?");
        faq8.setAnswer("1. Member can make payments either by cash, Demand Draft or cheques. Third party cheques are not acceptable. Issued cheques have to be realized before the auction date if the member wants to participate in auction." +
                "2. Online Payment Facility : Pay online directly from your Bank Account through Net Banking from our web site. For details visit our website \"www.pramsuhchits.com\"." +
                "3. ECS Facility : A Mandate is enough to authorise us to debit your Bank Account every month towards chit installments. For details contact any of our branches.");
        faq8.setNumber("8");
        QuestionsAnswers faq9 = new QuestionsAnswers();
        faq9.setQuestion("What is the security for my money?");
        faq9.setAnswer("A Registered Chit Fund Company makes a Security deposit equal to 100% of chit value in a Schedule Bank as FDR, which is pledged in favor of registrar of chits. Therefore, a member in a registered Chit Fund Company is very much secured than a member in a non-registered company.");
        faq9.setNumber("9");
        QuestionsAnswers faq10 = new QuestionsAnswers();
        faq10.setQuestion("How are Auctions conducted?");
        faq10.setAnswer("Auctions are conducted in the branches where in the foremen declares the successful bidder. All non-prized subscribers who have paid their Installments up to date are eligible to participate in the auctions. In case the payment is made by cheque the cheque should have been realised one day before the auction date.For every group the auction time is 5 minutes on a specified date and time. It is upto the members to be present in the auction hall 10 minutes before auction time as verification has to be done by branch for signatures of members and identification of proxies and their Bid Authorization letters." +
                "During the first few months there will be more number of participants willing to bid at the maximum discount. This maximum discount is predetermined for each group and should not go beyond 40 % of Chit value." +
                "The maximum bid limit varies between 30% to 40% depending on the duration of the chit. Out of which 5% of the chit value is the company's commission and the balance percentage is distributed as dividends equally among the members in the group. The member pays the next installment minus the dividend and the dividend amount is credited to his account." +
                "When there are more members for maximum discount their tokens are put in a box and one token is picked by way of lottery. The member who holds the ticket that is marked on the picked up token is declared as successful bidder who has to submit the required sureties depending on the Future Liability." +
                "When there are no maximum bid offers in the auction members can participate in open bidding during the auction time. When there are no maximum discount bidding members are supposed to participate in open bidding during auction time, which starts with a minimum 5% of chit value or any bid offer that has been given by a member prior to auction time. Members are supposed to bid in multiples of Rs.100/- from the minimum bid offer amount and the person who quotes the highest bid amount on the completion of 5th minute shall be declared the successful bidder by the foremen." +
                "If there are no offers above the bid offer the member who has given the highest amount as bid offer is declared as successful bidder. Bid offer is to be given to the office 24 hours prior to the day of auction in which one can mention the maximum bid amount that is acceptable to them. If a member is unable to participate in the auction the member can authorize some other person whose signatures has to be authenticated by the member. Generally member authorizes the family member or Development Officer's and Agents as proxies to participate in the auctions.");
        faq10.setNumber("10");
        QuestionsAnswers faq11 = new QuestionsAnswers();
        faq11.setQuestion("When can I participate in the auction?");
        faq11.setAnswer("A member can participate in auction right from the first auction itself, only if he or she has made the payments up to date. If paid by cheque, it should be realized before the auction date. A defaulter whose payment is not upto date before auction is not eligible to participate in the auction." );
        faq11.setNumber("11");
        QuestionsAnswers faq12 = new QuestionsAnswers();
        faq12.setQuestion("What is the purpose of bidding?");
        faq12.setAnswer("In every chit group some members will be in need of money. So all the members who are in need of money will be participating in the auction for bidding. The purpose of bidding is to declare the successful bidder who gives the highest bid amount (Not exceeding maximum limit) within the specified auction time i.e. 5 minutes.");
        faq12.setNumber("12");
        QuestionsAnswers faq13 = new QuestionsAnswers();
        faq13.setQuestion("What is the benefit from saving in chit?");
        faq13.setAnswer("There will be a compulsory saving which will earn dividends every month. Even if you take at the last month, the total dividends earned will be more than the bank interest rate." );
        faq13.setNumber("13");
        QuestionsAnswers faq14 = new QuestionsAnswers();
        faq14.setQuestion("What are the Income Tax benefits from saving or borrowing?");
        faq14.setAnswer("The dividends earned in a chit are not taxable. If you want to claim the bid as loss then these dividends has to be shown as revenue income in the assessment. Hence the entire dividend earned in a chit is not taxable if you don't claim the bid amount as loss.");
        faq14.setNumber("14");
        QuestionsAnswers faq15 = new QuestionsAnswers();
        faq15.setQuestion("What are the sureties to be submitted?");
        faq15.setAnswer("A member can give sureties depending on the future liability of the chit. Following are the sureties generally submitted by the members." +
                "1.Personal Surety: Any salaried person working in State/Central Govt./ Public Limited Companies/Banks and other Reputed Companies will be taken as surety." +
                "2.Pledge: Deposits with the company in chits or otherwise, net paid amount of which, after deducting foreman's commission should not be less than 1 1/3rd of the successful bidder's liability to the company." +
                "3.Bank Guarantee: Guarantee given by the Schedule Bank in a schedule format can be submitted as surety." +
                "4.Income Tax Assessor: Any person having I T Assessment for the past three years having business, profession etc will be taken as sureties." +
                "5.Property Pledge: Deposit of title deeds of urban property can be submitted as surety. Third party property can also be given as surety.");
        faq15.setNumber("15");
        QuestionsAnswers faq16 = new QuestionsAnswers();
        faq16.setQuestion("How soon can I expect the payment once I bid the chit?");
        faq16.setAnswer("Once a member is declared successful bidder it is his responsibility to provide satisfactory sureties/guarantors based on the future liability as specified in the byelaws. On receipt of the surety form the Branch forwards it to Corporate Office for Guarantor search. The liability of the member and guarantors are verified and then if the guarantors are acceptable it is sent back to the Branch for Documentation. The Branch has to prepare the document that mainly includes the guarantor bond and pro-note apart from the other requirements depending on the kind of sureties submitted." +
                "Once the documentation and verification is complete, the document is forwarded to CO, which scrutinizes the document in all aspects, and if the document is found to be satisfactory payment is released with in 2 days."+
                "In most of the cases the entire transactions are completed within 10 days very much depending on the kind of sureties and the document produced by the member. Members who make regular payments and those who submit the required documents immediately will have the greatest opportunity to receive the fastest payment.");
        faq16.setNumber("16");
        QuestionsAnswers faq17 = new QuestionsAnswers();
        faq17.setQuestion("What is a Chit group?");
        faq17.setAnswer("A Chit group refers to a specified number of members agreeing to subscribe a specified amount for a specified period. For example, 40 members, 40 months, Rs.500/- a month. The number of members and the number of months are to be the same.");
        faq17.setNumber("17");
        QuestionsAnswers faq18 = new QuestionsAnswers();
        faq18.setQuestion("Who is a foreman?");
        faq18.setAnswer("Any person under the Act responsible for the conduct of the chit and includes any Person, such as branch manager, discharging his functions.");
        faq18.setNumber("18");
        QuestionsAnswers faq19 = new QuestionsAnswers();
        faq19.setQuestion(" Is the contract of the subscribers with the foreman valid for an indefinite period?");
        faq19.setAnswer("No. It is valid only for the duration of a CHIT GROUP and until the liabilities of subscribers to foreman or vice versa are discharged or paid in full.");
        faq19.setNumber("19");
        QuestionsAnswers faq20 = new QuestionsAnswers();
        faq20.setQuestion("What is Chit agreement?");
        faq20.setAnswer("The Chit agreement is a contract between the foreman and the individual subscribers to a chit group. It is a set of bye-laws or regulations dealing with the procedure for the conduct of chits. It will be signed in duplicate, duly witnessed. The chit agreements shall contain the name and address of the subscriber, the number of tickets allotted to him, the number of instalments and the instalment amount payable, the interest/penalty for delayed payment, the probable date of commencement of chit and its duration, the manner of deciding the prize winner at each instalment, the maximum discount to be foregone at each instalment, the mode and proportion of dividend and foreman�s commission, the date, time and place of auction, the instalment at which the foreman is to get the chit amount, the name of the bank, the security to be furnished by prized subscriber etc., Though each subscriber is supposed to sign the chit agreement, in practice, each subscriber signs a declaration in the application form that he has read and understood the terms and conditions of the Chit Agreement. The declaration of all the subscribers are detached from the application form, pasted in a piece of paper and filed with the registrar.");
        faq20.setNumber("20");
        QuestionsAnswers faq21 = new QuestionsAnswers();
        faq21.setQuestion("How are the subscribers enrolled for a group?");
        faq21.setAnswer("The subscribers have to fill in an application form furnishing particulars of their names, residential and office addresses, approximate gross monthly salary, names of nominees and their relationship to them. They also have to sign the declaration that they have read and understood the terms & conditions of the Chit Agreement.");
        faq21.setNumber("21");
        QuestionsAnswers faq22 = new QuestionsAnswers();
        faq22.setQuestion("");
        faq22.setAnswer("");
        faq22.setNumber("22");
        QuestionsAnswers faq23 = new QuestionsAnswers();
        faq23.setQuestion("");
        faq23.setAnswer("");
        faq23.setNumber("23");
        QuestionsAnswers faq24 = new QuestionsAnswers();
        faq24.setQuestion("");
        faq24.setAnswer("");
        faq24.setNumber("24");
        QuestionsAnswers faq25 = new QuestionsAnswers();
        faq25.setQuestion("");
        faq25.setAnswer("");
        faq25.setNumber("25");
        QuestionsAnswers faq26 = new QuestionsAnswers();
        faq26.setQuestion("");
        faq26.setAnswer("");
        faq26.setNumber("26");
        QuestionsAnswers faq27 = new QuestionsAnswers();
        faq27.setQuestion("");
        faq27.setAnswer("");
        faq27.setNumber("27");
        QuestionsAnswers faq28 = new QuestionsAnswers();
        faq28.setQuestion("");
        faq28.setAnswer("");
        faq28.setNumber("28");
        QuestionsAnswers faq29 = new QuestionsAnswers();
        faq29.setQuestion("");
        faq29.setAnswer("");
        faq29.setNumber("29");
        QuestionsAnswers faq30 = new QuestionsAnswers();
        faq30.setQuestion("");
        faq30.setAnswer("");
        faq30.setNumber("30");

        if(null == questionsAnswersRepository.findByNumber(faq1.getNumber())){
            questionsAnswersRepository.save(faq1);
        }
        if(null == questionsAnswersRepository.findByNumber(faq2.getNumber())){
            questionsAnswersRepository.save(faq2);
        }
        if(null == questionsAnswersRepository.findByNumber(faq3.getNumber())){
            questionsAnswersRepository.save(faq3);
        }
        if(null == questionsAnswersRepository.findByNumber(faq4.getNumber())){
            questionsAnswersRepository.save(faq4);
        }
        if(null == questionsAnswersRepository.findByNumber(faq5.getNumber())){
            questionsAnswersRepository.save(faq5);
        }
        if(null == questionsAnswersRepository.findByNumber(faq6.getNumber())){
            questionsAnswersRepository.save(faq6);
        }
        if(null == questionsAnswersRepository.findByNumber(faq7.getNumber())){
            questionsAnswersRepository.save(faq7);
        }
        if(null == questionsAnswersRepository.findByNumber(faq8.getNumber())){
            questionsAnswersRepository.save(faq8);
        }
        if(null == questionsAnswersRepository.findByNumber(faq9.getNumber())){
            questionsAnswersRepository.save(faq9);
        }
        if(null == questionsAnswersRepository.findByNumber(faq10.getNumber())){
            questionsAnswersRepository.save(faq10);
        }
        if(null == questionsAnswersRepository.findByNumber(faq11.getNumber())){
            questionsAnswersRepository.save(faq11);
        }
        if(null == questionsAnswersRepository.findByNumber(faq12.getNumber())){
            questionsAnswersRepository.save(faq12);
        }
        if(null == questionsAnswersRepository.findByNumber(faq13.getNumber())){
            questionsAnswersRepository.save(faq13);
        }
        if(null == questionsAnswersRepository.findByNumber(faq14.getNumber())){
            questionsAnswersRepository.save(faq14);
        }
        if(null == questionsAnswersRepository.findByNumber(faq15.getNumber())){
            questionsAnswersRepository.save(faq15);
        }
        if(null == questionsAnswersRepository.findByNumber(faq16.getNumber())){
            questionsAnswersRepository.save(faq16);
        }
        if(null == questionsAnswersRepository.findByNumber(faq17.getNumber())){
            questionsAnswersRepository.save(faq17);
        }
        if(null == questionsAnswersRepository.findByNumber(faq18.getNumber())){
            questionsAnswersRepository.save(faq18);
        }
        if(null == questionsAnswersRepository.findByNumber(faq19.getNumber())){
            questionsAnswersRepository.save(faq19);
        }
        if(null == questionsAnswersRepository.findByNumber(faq20.getNumber())){
            questionsAnswersRepository.save(faq20);
        }
        if(null == questionsAnswersRepository.findByNumber(faq21.getNumber())){
            questionsAnswersRepository.save(faq21);
        }
        if(null == questionsAnswersRepository.findByNumber(faq22.getNumber())){
            questionsAnswersRepository.save(faq22);
        }
        if(null == questionsAnswersRepository.findByNumber(faq23.getNumber())){
            questionsAnswersRepository.save(faq23);
        }
        if(null == questionsAnswersRepository.findByNumber(faq24.getNumber())){
            questionsAnswersRepository.save(faq24);
        }
        if(null == questionsAnswersRepository.findByNumber(faq25.getNumber())){
            questionsAnswersRepository.save(faq25);
        }
        if(null == questionsAnswersRepository.findByNumber(faq26.getNumber())){
            questionsAnswersRepository.save(faq26);
        }
        if(null == questionsAnswersRepository.findByNumber(faq27.getNumber())){
            questionsAnswersRepository.save(faq27);
        }
        if(null == questionsAnswersRepository.findByNumber(faq28.getNumber())){
            questionsAnswersRepository.save(faq28);
        }
        if(null == questionsAnswersRepository.findByNumber(faq29.getNumber())){
            questionsAnswersRepository.save(faq29);
        }
        if(null == questionsAnswersRepository.findByNumber(faq30.getNumber())){
            questionsAnswersRepository.save(faq30);
        }
    }
}
