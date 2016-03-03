**Los Angeles, 2029...**

The earth is prey to an unending battle pitting humans against machines controlled by *Skynet*, the all-powerful self-aware artificial intelligence program. The Résistance is the sole surviving group of humans having survived the nuclear holocaust.

All direct assaults, tirelessly mounted against the machines' headquarters, seem only to provide temporary results and cripple your fighting force. You need to find a way to eradicate the problem at its source. Sheltered by the ruined city's underground structures, the best programmers left alive have developed a *virus capable of reading and modifying the machines' source code* enabling them to gain a certain amount of control over the deadly robots. But getting close enough to them is another story.

Heavily armored and fortified, Skynet's Central Core Installation is completely inacessible to any human being. The Resistance has decided to hijack some Moto-Terminators in order to contaminate them and send them back to Skynet's headquarters with low power reserves. As soon as a motorbike connects to the system to recharge, the virus will spread across the entire network, dealing a swift and fatal blow to Skynet...

A brave soldier managed at the cost of his life to inject a prototype of the virus into the machine, granting us limited control over it for a short period of time. At the end of a nearby bridge is a suspended platform surrounded by a deep chasm. The goal is to send the bike onto the platform, trapping it for us to pick up. The success of this mission is crucial for us, we will be able to write a new version of our virus capable of directing several tainted Moto-Terminators back to base at once, maximizing our chance of victory.

**The Goal**

The goal for your program is to make a motorbike jump across a gap and land on a platform then stop.

**Rules**

The platform is located on the otherside of a gap in the road above a chasm. The lengths of the road, gap and platform are measured in cells.

*At the start of the program*, you are given:
* The variable `road`: the length of the road before the gap.
* The variable `gap`: the length of the gap.
* The variable `platform`: the length of the platform.

*At the start of each game turn*, the motorbike gives you:
* The variable `speed`: its current speed.
* The variable `coordX`: its position on the road.
* The motorbike's initial position is `coordX` = 0. It always moves in a straight line. At the end of each turn, it moves forward a number of spaces equal to its speed (`speed`). For example, if `coordX` = 1 and `speed` = 3, `coordX` will be 4 at the next turn. The bike can start with any speed, including being at a stop.
 
Before the end of the turn, you must output one of the following commands:
* `SPEED`: increases the speed of the motorbike by 1 (+1 to the `speed` variable).
* `SLOW`: decreases the speed of the motorbike by 1 (-1 to the `speed` variable).
* `JUMP`: makes the motorbike jump.
* `WAIT`: does nothing (the motorbike keeps the same speed).

*Victory Conditions* :trophy: The mission is a success if the bike comes at a stop on the landing platform.

*Lose Conditions* :skull: The bike falls or did not get to the platform in less than 150 turns.

**Note**

Don’t forget to run the tests by launching them from the “Test cases” window.
*Beware*: the tests used to calculate your score are slightly different to those provided to you to avoid hard-coded solutions.

**Game Input**

**Initialization input**

* *Line 1*: `road` the length of the road before the gap.
* *Line 2*: `gap` the length of the gap.
* *Line 3*: `platform` the length of the landing platform.

**Input for one game turn**

* *Line 1*: `speed` the motorbike's speed.
* *Line 2*: `coordX` the position on the road of the motorbike.
 
**Output for one game turn**

A single line containing one of 4 keywords: `SPEED` `SLOW` `JUMP` `WAIT`.

**Constraints**

The initial position of the motorbike is always `coordX` = 0.
* 0 ≤ `speed` < 50
* 0 ≤ `coordX` < 100
* 1 ≤ `road` ≤ 100
* 1 ≤ `gap` ≤ 100
* 1 ≤ `platform` ≤ 100
* Response time for one game turn ≤ 150ms

The program must first read the initialization data from standard input. Then, within an *infinite loop*, read the data from the standard input related to the motorbike's current state and provide to the standard output the desired instructions.
