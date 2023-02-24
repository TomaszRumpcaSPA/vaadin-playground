package com.example.application.views.main;

import com.example.application.security.SecurityService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MainLayout extends AppLayout {

    public MainLayout(SecurityService securityService) {
        H1 logo = new H1("Vaadin CRM");
        logo.addClassName("logo");
        HorizontalLayout header;
        if (securityService.getAuthenticatedUser() != null) {
            Button logout = new Button("Logout", click ->
                    securityService.logout());
            header = new HorizontalLayout(logo, logout);
        } else {
            header = new HorizontalLayout(logo);
        }

        // Other page components omitted.

        addToNavbar(header);
    }
}
