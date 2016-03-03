**Synopsis**

“*Captain's log, stardate 1567.9.* We are entering the Deneb system two days after receiving a distress call issuing from the unexplored planet XIV of this system. Our mission is to bring aid to whomever is in need of our help on this planet.”
 
“*Captain's log, supplemental.* While reaching the planet, our rescue ship was drawn to a point on the surface by an invisible force that we have yet to understand. Despite all efforts, the ship continues its downward course and we are at great risk of colliding with the mountains that tower below us.”
 
“*Captain's log, supplemental.* In a final attempt, Scotty was able to re-engineer the phase cannons so that they can now destroy the mountains from their foundations. This gives us hope of landing safely on the planet. We are now looking for a crew member able to program the firing rate of the phase cannons to get us out safely from what clearly appears to be a trap designed to destroy us.”

**The Goal**

Write the program that destroys the mountains before your starship collides with one of them.

**Rules**

Your starship moves along the horizontal axis across 8 cells at an initial height of 10 kilometers. Each cell contains a mountain, some taller than others (from 0 to 9 kilometers).

The starship circles above all the mountains, going first from left to right, then from right to left, and so on and so forth. With each complete pass, the starship descends one kilometer as it is being drawn to the surface by an unknown force.

*At the start of each game turn*, you are given:
* the variable `spaceX`: the horizontal coordinate of your ship (0 to 7)
* the variable `spaceY`: the altitude at which your ship is advancing in kilometers (10 to 1)
* the height of each mountain from left to right (8 values `mountainH`)

By the end of the game turn, you must output one of the following commands:
* `HOLD`: your ship does not fire.
* `FIRE`: your ship shoots the mountain directly below it.

However, you may fire only *once per pass*. Firing on a mountain base *will only destroy part of it* and it will sink a random number of kilometers.

Once the turn is finished, your ship moves one cell forwards, descending by a kilometer if it completes a pass.
 
*Victory Conditions* :trophy: You win if you destroy every mountain

*Lose Conditions* :skull: Your ship crashes into a mountain

**Note**

Don’t forget to run the tests by launching them from the “Test cases” window. The tests provided and the validators used to calculate your score are slightly different to avoid hard-coded solutions.

**Game Input**

Within an infinite loop, read the data from the standard input related to the current state of the landing and send to the standard output the starship firing instructions.

**Input for one game turn**

*Line 1*: Two integers `spaceX` and `spaceY`:
* `spaceX` is the horizontal coordinate or your starship (in kilometers). It goes from `0` (left of the screen, above first mountain) to `7` (right of the screen above last mountain)
* `spaceY` is the current altitude of your ship (in kilometers). It goes down from `10` (top of the screen) to `1` (just above ground).

*Next `8` lines*: one integer `mountainH` per line. Each represents the height of one mountain (`0` means that the mountain is destroyed). The mountains' heights are provided from left to right.

**Output for one game turn**

A *single line* with either:
* `FIRE`: ship is firing below it with its phase cannons. If the cannon already fired during the pass, it has no effect (same as `HOLD`),
* `HOLD`: ship is not firing.

**Constraints**

* 0 ≤ `spaceX` ≤ 7
* 0 < `spaceY` ≤ 10
* 0 ≤ `mountainH` ≤ 9
* Response time per turn ≤ 100ms
