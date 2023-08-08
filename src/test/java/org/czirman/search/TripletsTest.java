package org.czirman.search;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletsTest {

    Triplets triplets = new Triplets();

    @Test
    public void sampleTest0(){
        //given
        List wa = Arrays.asList(1, 4, 5);
        List a = new ArrayList(wa);
        List wb = Arrays.asList(2, 3, 3);
        List b = new ArrayList(wb);
        List wc = Arrays.asList(1, 2, 3);
        List c = new ArrayList(wc);
        //when
        long result = triplets.triplets(a,b,c);
        //then
        assertEquals(5, result);
    }

    List<Integer> listaA;
    List<Integer> listaB;
    List<Integer> listaC;

    @Test
    public void testbig(){
        //given
        getData();

        //when
        long result = triplets.triplets(listaA,listaB,listaC);
        //then
        assertEquals(5, result);

    }
    private void getData(){
        String resourceName = "tripleSum.txt";
        Path resourceDirectory = Paths.get("src","test","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        File file = new File(absolutePath);
        List<String> allLines = null;    
        try {
            allLines = Files.readAllLines(Path.of(file.toPath() + "/" + resourceName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String line = allLines.get(0);
        String[] lineTab = line.split(",");
        listaA =Stream.of(lineTab).map(arg->Integer.parseInt(arg)).collect(Collectors.toList());

        line = allLines.get(1);
        lineTab = line.split(",");
        listaB =Stream.of(lineTab).map(arg->Integer.parseInt(arg)).collect(Collectors.toList());

        line = allLines.get(2);
        lineTab = line.split(",");
        listaC =Stream.of(lineTab).map(arg->Integer.parseInt(arg)).collect(Collectors.toList());

    }
}
