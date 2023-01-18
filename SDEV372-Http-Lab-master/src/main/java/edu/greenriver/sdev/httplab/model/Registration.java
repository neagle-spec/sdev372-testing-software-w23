package edu.greenriver.sdev.httplab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration
{
    //name
    private String fName;
    private String mName;
    private String lName;

    //bio details
    private String road;
    private String city;
    private String state;
    private int zip;
    private String biography;

    public String getFullName()
    {
        return fName + " " + mName + " " + lName;
    }

    public String getFullAddress()
    {
        return road + " " + city + ", " + state + " " + zip;
    }
}
