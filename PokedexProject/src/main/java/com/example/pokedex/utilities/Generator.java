package com.example.pokedex.utilities;

import com.example.pokedex.models.PokemonDTB;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generator {
    private static PokemonDTB pokemon;


    public static void logHtmlToFile(String filePath, OutputHtmlGeneratorInterface generator) throws IOException {
        Files.write(Paths.get(filePath), generator.generateHtml(pokemon).getBytes(StandardCharsets.UTF_8));
    }

    public static void logTextToConsole(OutputTextGeneratorInterface generator) {
        System.out.println(generator.generateText(pokemon));
    }

}
