package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String textFile = "C:\\Users\\jaman\\MidtermJuly2017\\src\\data\\self-driving-car";

		try{
			FileReader fr = new FileReader(textFile);
			BufferedReader br = new BufferedReader(fr);

			String line= "";
			while ((line =br.readLine())!= null) {
				System.out.println(line);
			}
		}catch(FileNotFoundException e){
			System.out.println("File path not found");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}