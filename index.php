<?php include 'config.php'; ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MCA SEM 1 ALL NOTES</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1>MCA SEM 1 ALL NOTES</h1>
    </header>
    <main>
        <div class="subjects">
            <?php
            // Define subject names and corresponding image paths
            $subjects = [
                'JAVA' => 'images/java.png',
                'DS' => 'images/ds.png',
                'PHP' => 'images/php.png',
                'ADBMS' => 'images/adbms.png',
                'SE' => 'images/se.png'
            ];

            // Display subject cards with images
            foreach ($subjects as $subject => $image) {
                echo "
                    <div class='subject-card'>
                        <a href='subject.php?name=$subject'>
                            <img src='$image' alt='$subject'>
                            <h2>$subject</h2>
                        </a>
                    </div>
                ";
            }
            ?>
        </div>
    </main>
</body>
</html>
