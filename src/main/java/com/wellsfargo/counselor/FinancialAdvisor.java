package com.wellsfargo.counselor;

import jakarta.persistence.Entity;

    @Entity
    public class FinancialAdvisor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String phoneNumber;

        @OneToMany(mappedBy = "financialAdvisor")
        private List<Client> clients;

        // Default constructor
        public FinancialAdvisor() {}

        // Parameterized constructor
        public FinancialAdvisor(String name, String email, String phoneNumber) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPhoneNumber() { return phoneNumber; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
        public List<Client> getClients() { return clients; }
        public void setClients(List<Client> clients) { this.clients = clients; }
    }

}
