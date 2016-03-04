import System.IO

main :: IO ()
main = do
    hSetBuffering stdout NoBuffering -- DO NOT REMOVE
    
    loop

loop :: IO ()
loop = do
    input_line <- getLine
    let enemy1 = input_line :: String -- name of enemy 1
    input_line <- getLine
    let dist1 = read input_line :: Int -- distance to enemy 1
    input_line <- getLine
    let enemy2 = input_line :: String -- name of enemy 2
    input_line <- getLine
    let dist2 = read input_line :: Int -- distance to enemy 2
    
    
    if (dist1 < dist2) then
        putStrLn enemy1
    else
        putStrLn enemy2
    
    loop
