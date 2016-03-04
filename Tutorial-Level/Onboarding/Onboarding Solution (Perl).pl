select(STDOUT); $| = 1; # DO NOT REMOVE

while (1) {
    chomp(my $enemy_1 = <STDIN>); # name of enemy 1
    chomp(my $dist_1 = <STDIN>); # distance to enemy 1
    chomp(my $enemy_2 = <STDIN>); # name of enemy 2
    chomp(my $dist_2 = <STDIN>); # distance to enemy 2
    
    if ($dist_1 < $dist_2) {
        print "$enemy_1\n";
    } else {
        print "$enemy_2\n";
    }
}
