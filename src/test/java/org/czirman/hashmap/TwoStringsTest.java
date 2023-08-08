package org.czirman.hashmap;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TwoStringsTest {
    TwoStrings twoStrings = new TwoStrings();

    @Test
    public void testBigCase() throws IOException {
        //given
        String resourceName = "twoString.txt";
        Path resourceDirectory = Paths.get("src","test","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        File file = new File(absolutePath);

        List<String> allLines = Files.readAllLines(Path.of(file.toPath() + "/" + resourceName));

        //when
        twoStrings.twoStrings(allLines.get(0), allLines.get(1));

    }

}
