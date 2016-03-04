object Player extends App {
    while(true) {
        val enemy1 = readLine // name of enemy 1
        val dist1 = readInt // distance to enemy 1
        val enemy2 = readLine // name of enemy 2
        val dist2 = readInt // distance to enemy 2
        
        if (dist1 < dist2) {
            println(enemy1)
        } else {
            println(enemy2)
        }
    }
}
