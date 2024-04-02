/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author danis
 */
public class CommandExecutor {
    private final Repository repository;

    public CommandExecutor(Repository repository) {
        this.repository = repository;
    }

    public void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter command (view/report/export): ");
                String input = reader.readLine().trim();  // Trim the input to remove leading/trailing spaces

                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }

                try {
                    Command command = createCommand(input);
                    if (command != null) {
                        command.execute();
                    } else {
                        System.out.println("Invalid command. Please try again.");
                    }
                } catch (IOException e) {
                    System.err.println("IOException: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("IOException while reading input: " + e.getMessage());
        }
    }

    private Command createCommand(String input) {
        String[] parts = input.split("\\s+", 2);  
        if (parts.length < 1) {
            return null;
        }

        String commandName = parts[0].toLowerCase();
        switch (commandName) {
            case "view":
                if (parts.length >= 2) {
                    return new ViewCommand(parts[1]);
                }
                break;
            case "report":
  return new ReportCommand(repository, "C:\\Users\\hritc\\OneDrive\\Documents\\GitHub\\Pa_A2_2024\\lab5\\src\\test");
            case "export":
                if (parts.length >= 2) {
                    return new ExportCommand(repository, parts[1]);
                }
                break;
        }
        return null;
    }
}