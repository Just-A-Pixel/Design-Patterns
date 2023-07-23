# Strategy Pattern

### Overview
Suppose you are making a duck simulator, where every type of duck has common behavior - quack, swim, fly, etc.
But, the implementation of these behaviors is different. 

For example, a red duck can fly. A wooden duck won't fly.

A simple way to implement this would be to create a ```Duck``` class containing these behaviors as methods and extend it to each duck type, then override the methods.

Some problems you'll face with this approach are:
1. On adding a new duck, you'll have to override the same methods again. What if there are 100 different ducks?
2. The code is tightly coupled. The subsequent changes will take place in an already working code, which might break it.
3. The behavior is decided on compile time itself. For example, imagine including a feature where the wooden duck gets a power-up and now it can fly. We will have to change the fly behaviour at runtime.

Thus, the strategy pattern groups each implementation of common behavior into a separate class. Apart from loose coupling, each implementation in behavior can be switched between at runtime.

We are implementing a duck simulator similar to the example given in the book Head First Design Patterns: 
![image](https://github.com/Just-A-Pixel/Design-Patterns/assets/58350132/f73098c6-0a44-4a4a-aec4-ca4b67cbb773)

### Implementation
1. Separate each behavior into an interface or abstract class. For example, all implementations of 'quack' can be a class called ```QuackBehaviour```. This interface will have one method - ```quack()```, that the Duck class will call.
2. Each behaviour implementation is a class that implements the corresponding behavior interface.
3. In the```Duck``` class, we delegate the tasks of quack(), fly(), useWeapon() by storing an instance of all the behavior interfaces and call the interface methods to delegate the tasks. This is formally known as 'context'.
4. Each object is a client that decides which algorithm to use at runtime. The initial choice of the algorithm is decided by class of the object that has been created. As you will see in the code in ```main.java```, this can be changed at runtime.

### Using this example
1. Run the project by running ```main.java```.
2. The common use cases of the pattern are written in ```main.java```.
3. You can change behaviour at runtime as given in the ```main.java``` example.
4. Feel free to add new ducks and/or behaviours! Notice how everything is loosely coupled.

To get a deeper dive into this, feel free to look into Head First Design Patterns :) 






