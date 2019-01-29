# Adapter
## explanation 1:
An adapter helps two incompatible interfaces to work together. This is the real world definition
for an adapter. 
Interfaces may be incompatible but the inner functionality should suit the need.

The Adapter design pattern allows otherwise incompatible classes to work together by converting
the interface of one class into an interface expected by the clients.

## explanation 2 (head first)
Wrap some objects to make their interfaces look like something they’re not. 
Why would we do that? So we can adapt a design expecting one interface to a class that implements a different interface.

## Exercise

Pirates are coming! we need a `RowingBoat` to flee! 
We have a `FishingBoat` and our captain. We have no time to make up a new ship! We need to reuse this `FishingBoat`. 
The captain needs a rowing boat which he can operate. The spec is in `RowingBoat`. We will use the Adapter pattern to reuse `FishingBoat`.


# Facade
## Intent
Provide a unified interface to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.

In plain words

> Facade pattern provides a simplified interface to a complex subsystem.

Wikipedia says

> A facade is an object that provides a simplified interface to a larger body of code, such as a class library.

## Explanation

Real world example

> How does a goldmine work? "Well, the miners go down there and dig gold!" you say. 
That is what you believe because you are using a simple interface that goldmine provides on the outside, internally it has to do a lot of stuff to make it happen.
This simple interface to the complex subsystem is a facade.


## Exercise

The goldmine employs 4 different kind of dwarven mine workers. (DwarvenCartOperator, DwarvenGoldDigger, DwarvenTunnelDigger) 

Each kind of worker executes a specific action in the goldmine.

So high level a day at the mine looks like this for a dwarf:
* wake up and go to the mine
* dig out gold
* go home and go to sleep

Depending on the type of dwarf you have to perform other actions in the mine.

Create a DwarvenGoldmineFacade that makes 3 different kind of dwarves work in the mine and provides a simple interface to the goldmine subsystem.


