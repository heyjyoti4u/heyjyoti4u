<?php include 'config.php'; ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subject Notes</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <h1><?php echo htmlspecialchars($_GET['name']); ?> Notes</h1>
    </header>
    <main>
        <div class="notes-list">
            <?php
            $subject = htmlspecialchars($_GET['name']);
            $subject_dir = MATERIALS_DIR . $subject;

            if (is_dir($subject_dir)) {
                // List all files in the subject folder
                $files = scandir($subject_dir);

                foreach ($files as $file) {
                    if ($file !== '.' && $file !== '..') {
                        $file_url = "materials/$subject/$file";
                        echo "
                            <div class='note'>
                                <a href='$file_url' target='_blank'>$file</a>
                            </div>
                        ";
                    }
                }
            } else {
                echo "<p>No notes found for this subject.</p>";
            }
            ?>
        </div>
        <a href="index.php" class="back-button">Back to All Subjects</a>
    </main>
</body>
</html>
