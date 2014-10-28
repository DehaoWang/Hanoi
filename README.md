Hanoi
=====

Hanoi: disk-moving algorithm

START STATUS: 
There are 3 poles (Numbered: 0, 1 and 2) and a number of different-sized disks which can slide onto the poles. The disks are in pole A in ascending order of size (smallest disk at the top).

OBJECTIVE: 
Move all the disks from the pole 0 to pole 2.

RULES:  
1. Only one disk can be moved at a time from a source stack to a target stack. 
2. The moved disk must be the topmost disk of a source stack and it is placed on top of a target stack.
3. No disk can be placed on top of a smaller disk.

One of the solutions: Recursion

If the objective is moving N disks from pole A to pole C when pole B is the spare one, we can break it down in this way:

1. Move N-1 disks from A to B, using pole C as a spare. (*)
2. Move the last disk from A to C.
3. Move N-1 disks from B to C, using pole A as a spare. (*)

The * lines are the similar problems to the original one but of a smaller version. This can be solved by recursive methods.

The java source code gives a example of moving 4 disks from pole 0 to pole 2. The console output shows the steps used and the corresponding moving details.
