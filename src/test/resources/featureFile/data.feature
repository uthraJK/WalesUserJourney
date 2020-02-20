Feature:  Wales User Journey
Scenario Outline: Validating the Eligibility of Treamtment
Given I am a person from Wales "<countryname>"
When I put my circumstances into the Checker tool "<Day>" ,"<Month>","<Year>","<Partner>","<TaxDetails>","<UniversalCredit>","<JointUniversalCredit>","<TakeHome>"
Then I should get a result of whether I will get help or not
Examples:
|countryname|Day|Month|Year|Partner|TaxDetails|UniversalCredit|JointUniversalCredit|TakeHome|
|   Wales   |31 | 12 | 1992|    Yes|      Yes |           Yes |         Yes          |Yes   |