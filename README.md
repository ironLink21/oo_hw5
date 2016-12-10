# Creator
Seth Bertlshofer
11/30/16
Assign5

# Working/Implemented
Tests for all matchers
refactor using Template Method instead of Strategy pattern for mathers
Strategy pattern for Person
Strategy pattern for Parser
all diagrams created (state, action, UML)

# Not Implemented
XML parsing

# Docs
UML diagram can be found in "/assign5.vpp" (visual paradigm file) (this has all 3 files inside of the one project)

# Dependencies
jackson-annotations 2.8.5
jackson-core 2.8.5
jackson-databind 2.8.5
junit 4.12

# note
I decided to use the Template pattern because it functions well with the Strategy pattern.  This allowed me to cut down
on a lot of redundant code and also make the code more readable.  This also allowed me to specify easier what each class 
was doing instead of creating a new class that had to create a lot of the same objects.  With the template pattern I just 
had to use it's bucket that was filled once and then I copied it into each template class so that each class could do it's 
own thing without changing the original bucket.  The template pattern also allowed me to run functions in sequence.  This
allowed me to perform more specific things in each function. 