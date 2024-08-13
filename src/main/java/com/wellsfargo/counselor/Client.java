package com.wellsfargo.counselor;

    @Entity
    public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String phoneNumber;

        @ManyToOne
        private FinancialAdvisor financialAdvisor;

        @OneToOne(mappedBy = "client")
        private Portfolio portfolio;

        // Default constructor
        public Client() {}

        // Parameterized constructor
        public Client(String name, String email, String phoneNumber, FinancialAdvisor financialAdvisor) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.financialAdvisor = financialAdvisor;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPhoneNumber() { return phoneNumber; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
        public FinancialAdvisor getFinancialAdvisor() { return financialAdvisor; }
        public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) { this.financialAdvisor = financialAdvisor; }
        public Portfolio getPortfolio() { return portfolio; }
        public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    }

}
