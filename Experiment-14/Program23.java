import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Program23 {
public static void main(String[] args) {
String fileName = "sample.txt";
try {
File file = new File(fileName);
if (file.createNewFile()) {
System.out.println("File created: " + file.getName());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("Error creating file.");
}
try {
FileWriter writer = new FileWriter(fileName);
writer.write("Hello! This is file handling using Scanner.\n");
writer.write("Java makes file handling easy.");
writer.close();
System.out.println("Data written to file.");
} catch (IOException e) {
System.out.println("Error writing to file.");
}
try {
File file = new File(fileName);
Scanner reader = new Scanner(file);
System.out.println("\nReading from file:");
while (reader.hasNextLine()) {
String line = reader.nextLine();
System.out.println(line);
}
reader.close();
} catch (IOException e) {
System.out.println("Error reading file.");
}
File file = new File(fileName);
if (file.exists()) {
System.out.println("\nFile Info:");
System.out.println("Name: " + file.getName());
System.out.println("Path: " + file.getAbsolutePath());
System.out.println("Readable: " + file.canRead());
System.out.println("Writable: " + file.canWrite());
System.out.println("Size: " + file.length() + " bytes");
}
}
}