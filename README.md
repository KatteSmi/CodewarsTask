The goal is to calculate the length of a cable.

The cable will be symbolized with a combination of the following characters: -, _, =.

Each character has a different length: - is of length 1, _ of length 2 and = of length 3.

Sometimes the cable is making a loop. This will be symbolized with brackets.

When you have reached a closing bracket ), you have to go back to the corresponding opening bracket and count the length again -> this represents a loop.

If a cable is broken, meaning number of ( is not equal to number of ), you must throw a BracketException of type RuntimeException that you must implement yourself.
