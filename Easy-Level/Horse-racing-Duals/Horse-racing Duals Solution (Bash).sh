read N
declare -a arrPi

for((i=0 ; i<N ; i++))
do
    read Pi
    arrPi[$Pi]=0
done

arrPiLength=${#arrPi[@]}

if [[ $N -eq 0 ]] || [[ $arrPiLength -ne $N ]]
then
    maxDiff=0
else
    maxDiff=10000000
    previous=-1
    
    for i in ${!arrPi[@]}
    do
        diff=$(( $i - $previous ))
        
        if [[ $previous -ne -1 ]] && [[ $diff -lt $maxDiff ]]
        then 
            maxDiff=$(($i-$previous))
        fi
        
        previous=$i
    done
fi

echo $maxDiff
