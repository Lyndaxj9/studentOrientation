[
  adopted from http://www.cs.rochester.edu/u/www/courses/171/Fall-03/files/readme.txt
  by Deger Cenk Erdil
  for CS654 Distributed Systems
  This is a template README file about how you should form your own README file.
  In general,
        you should remove anything in between square brackets (i.e. [..]), and
        you should replace anything in between <> with a value.
]

CS442 Design Patterns
FALL 2016
ASSIGNMENT 03 README FILE

Due Date: Friday, October 28, 2016>
Submission Date: Friday, October 28, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: ? Days
Author(s): Omowumi L. Ademola 
e-mail(s): oademol1@binghamton.edu


PURPOSE:

[
    The purpose of this assignment was to display the use of the Builder
    Design Pattern in creating a student orientation schedule based on
    their selection using enums in the Driver.
]

PERCENT COMPLETE:

[
    I believe I have completed 100% of this project.
]

PARTS THAT ARE NOT COMPLETE:

[
    Nothing is incomplete.
]

BUGS:

[
    None.
]

FILES:

[
  Included with this project are 5 files:

    Driver.java, the file that creates the studentOrientation 
    ActivityInterface.java, the interface for all the activities
    BookstoreInterface.java, the interface for the bookstore concrete classes
    RegisterInterface.java, the interface for the course registration concrete classes
    SelectDormInterface.java, the interface for the dorm selection concrete classes
    TourInterface.java, the interface for the tour type concrete classes
    OOOrientation.java, the interface for the student orientation concrete class
    OOStudentOrientation.java, the concrete class for the student orientation
    Options.java, the file that houses all the enum selections
    DormGame.java, the file that holds the logic for dorm selection by game
    DormOffice.java, the file that holds the logic for dorm selection by office
    MandoBooks.java, the file that holds the logic buying books at MandoBooks
    UniBookstore.java, the file holds the logic for buying books @ the university bookstore
    RegComplab.java, the file holds logic for register courses @ a computer lab
    RegOffice.java, the file holds logic for register courses @ a office
    Tourbus.java, the file holds logic for taking a bus tour
    Tourfoot.java, the file holds logic for taking a tour by foot
    CarbonFPI.java, the file is the interface for carbon concrete classes
    CostI.java, the file is the interface for cost concrete classes
    DurationI.java, the file is the interface for the duration concrete classes
    EffortI.java, the file is the interface for the effort concrete classes
    BookCarbon.java ;
    DormCarbon.java ;
    RegCarbon.java ;
    TourCarbon.java , these files hold the logic for carbon calculations for their
        respective concrete classes
    BookCost.java ;
    DormCost.java ;
    RegCost.java ;
    TourCost.java , these files hold the logic for prices for their respective concrete classes
    BookDuration.java ;
    DormDuration.java ;
    RegDuration.java ;
    TourDuration.java , these files hold the logic for the time taken to do each activity
    BookEffort.java ;
    DormEffort.java ;
    RegEffort.java ;
    TourEffort.java , these files hold the logic for the effort taken to do each activity
    SimpleActivityFactoryI.java, the file is the interface for the other factories
    SimpleBookstoreFactory.java ;
    SimpleDormFactory.java ;
    SimpleRegisterFactory.java ;
    SimpleTourFactory.java , these files handle creating concrete objects for their respective activities
    OrientationWorkshopI.java, this file is the interface for the student orientation workshop
    StudentOWorkshop.java, this file constructs/builds the student orientation
    Logger.java, this file is used to print out debugs
    README, the text file you are presently reading
]

SAMPLE OUTPUT:

[
    lynda$ ant -buildfile build.xml run
    ...
    [java] -- Your schedule --
    [java] Selected: UNIBOOKSTORE TOURBUS DORMOFFICE REGCOMPLAB
    [java] Cost: $12159.99
    [java] Duration: 95 minutes
    [java] Effort: 822 calories
    [java] Carbon Footprint: 0.00220680 tonnes

]

TO COMPILE:

[
    Extract the files
    In the Ademola_Omowumi folder run "ant -buildfile studentOrientation/build.xml all"
]

TO RUN:

[
    Please run as: ant -buildfile studentOrientation/build.xml run 
]

JAVADOCS:

[
    To generate javadocs run in the Ademola_Omowumi folder: "ant -buildfile studentOrientation/build.xml javadocs"
    The javadocs are located in /Ademola_Omowumi/BUILD/doc/studentOrientation
]

EXTRA CREDIT:

[
    N/A
]


BIBLIOGRAPHY:

[
    This serves as evidence that we are in no way intending Academic Dishonesty.
    Omowumi L. Ademola
]

ACKNOWLEDGEMENT:

[
    N/A
]
