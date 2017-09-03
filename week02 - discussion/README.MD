### Prompt
What does the super keyword represents and where can it be used? Give an example of a superclass and subclass. Be sure to make all the instances variables of the super class private. Include at least one constructor in each class and ensure that the constructor of the subclass calls the constructor of the superclass. Also include a toString method in both classes that returns the values of the instance variables with appropriate labels. Ensure that the toString method of subclass calls the toString method of the superclass so that the string returned contains the values of all the inherited instance variables.

### Response
Super is a reference variable in java used to refer to a parent class. It is used in a subclass and can invoke the immediate parent class's constructors and methods.

I created a superclass called Whisky with a subclass called Scotch. Additional subclasses could include Irish, Bourbon, Canadian, Japanese, and Rye. Whisky includes traits common to various whiskies such as grain, still, and barrel types, age, release year, ABV, and how whisk(e)y is spelled. Scotch extends whisky with additional attributes specific to Scotch including number of distillations, region, peating, type, and chill filtering. The subclass uses super in its constructor and toString to invoke the constructor and toString method of the superclass. I have attached my classes as well as a class with a main to test them using two Scotch objects and one Whisky object. Sample output from calling the toString method is below.

Nicole

Distiller: Ardbeg Name: Supernova Primary Grain: barley Still Type: pot Barrel Type: bourbon Release Year 2015 Age: 3 Alcohol by Volume: 54.3% Spelled with an E?: false Number of Distillations: 2 Region: Islay Peated: true Type: single malt Chill Filtered: false

Distiller: Laphroaig Name: Quarter Cask  Primary Grain: barley Still Type: pot Barrel Type: bourbon and quarter cask Release Year 2004 Age: 3 Alcohol by Volume: 48.0% Spelled with an E?: false Number of Distillations: 2 Region: Islay Peated: true Type: single malt Chill Filtered: false

Distiller: Willet Name: Pot Still Reserve Primary Grain: corn Still Type: pot Barrel Type: new oak Release Year 2008 Age: 8 Alcohol by Volume: 47.0% Spelled with an E?: true
