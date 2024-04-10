package entities;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment(double amount, int months){ // colocando default para mais de uma classe utilizar o mesmo pensamento do metodo
        if(months < 1){
            throw new InvalidParameterException("Months must be greater tha zero"); // colocando uma defesa do metodo
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months); // é a quantia vezes a elevaçao de 1 mais interestRate elevado por meses
    }
}
