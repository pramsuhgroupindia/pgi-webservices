package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInData {

    private String aadharNumber;

    private String password;

    private String message;
}
