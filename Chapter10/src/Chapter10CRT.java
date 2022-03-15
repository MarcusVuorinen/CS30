/*
Chapter 10 CRT

Marcus Vuorinen

What is a GUI?
A GUI (Graphical User Interface) uses different components such as frames, labels, and text fields to present the user with an interactive display screen. 


Explain how code is executed in an event-driven application.
Code in an event driven application is executed by an event handler that responds to different inputs from the user.


Can components be added directly to a frame? Explain. 
Yes, a frame is a container that acts as a window with the different components layered on top of it. The components are directly added into the frame.


Can a label respond to events? Explain.
A label is used to display text that cannot be altered by the user like a text field, or button could. Labels are unable to communicate with the rest of the application therefore it cannot respond to events.


Why do you think a GUI needs to be run from an event-dispatching thread?
A GUI needs to be run from an event-dispatching thread because the inputs entered by the user must be processed and responded to. In order to be interactive, a GUI needs to be event dispatching.


What is the difference between a label and a button?
A button can be clicked by the user to communicate with the rest of the code in the application, having an effect on the output window. On the other hand, a label is simply a display that cannot be interacted with. 

*/