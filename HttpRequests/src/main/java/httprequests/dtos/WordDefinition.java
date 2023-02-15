package httprequests.dtos;

import lombok.Value;

@Value
public class WordDefinition
{
    private String word;
    private String definition;
}