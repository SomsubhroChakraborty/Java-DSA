package SocketProgramming;

import java.io.*;
import java.net.*;

public class SocServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Server started...");
        ServerSocket serverSocket = new ServerSocket(5050);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            new ClientHandler(clientSocket).start(); // Handle each client in a new thread
        }
    }
}

// Thread to handle individual client
class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("Client message: " + message);

            // Optional: respond to client
            // PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // out.println("Message received!");

            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
