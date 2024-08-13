package com.wellsfargo.counselor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Portfolio {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne
        private Client client;

        @OneToMany(mappedBy = "portfolio")
        private List<Security> securities;

        // Default constructor
        public Portfolio() {}

        // Parameterized constructor
        public Portfolio(Client client) {
            this.client = client;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public Client getClient() { return client; }
        public void setClient(Client client) { this.client = client; }
        public List<Security> getSecurities() { return securities; }
        public void setSecurities(List<Security> securities) { this.securities = securities; }
    }

}
