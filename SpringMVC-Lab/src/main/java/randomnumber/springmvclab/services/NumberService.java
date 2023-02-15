package randomnumber.springmvclab.services;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Class with a single method that generates random numbers.
 * @author Aaron
 * @version 1.0
 */
@Service
public class NumberService {

    /**
     * @param low range for random number
     * @param high range for random number
     * @return random num
     */
    public int between (int low, int high){
        Random rand = new Random();
        return rand.nextInt(high-low) + low;
    }

}
