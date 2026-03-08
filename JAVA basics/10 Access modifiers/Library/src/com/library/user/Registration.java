package com.library.user;

public class Registration {
        private void validateEmail(String email) {
            System.out.println("Email : "+email);
        }
        private void validatePhone(long phone) {
            System.out.println("Phone : "+phone);
        }
        public void registerUser(String email,long phone) {
            validateEmail(email);
            validatePhone(phone);
            System.out.println("Registration Complete");
        }

}
