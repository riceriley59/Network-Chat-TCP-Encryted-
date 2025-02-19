# Network Chat TCP Encrypted

A simple network chat application enabling clients to connect and communicate securely over a TCP/IP network. This project implements encryption to ensure that messages exchanged between clients are secure.

## Features

- **Secure Communication**: Messages are encrypted to protect against interception.
- **Multi-Client Support**: Multiple clients can connect to the server simultaneously.
- **User-Friendly Interface**: Simple command-line interface for easy interaction.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/riceriley59/Network-Chat-TCP-Encryted-.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd Network-Chat-TCP-Encryted-
   ```

3. **Compile the Source Code**:
   ```bash
   javac *.java
   ```
   Ensure you have Java Development Kit (JDK) installed.

## Usage

1. **Start the Server**:
   ```bash
   java Server
   ```
   The server will start listening for client connections.

2. **Connect a Client**:
   ```bash
   java Client
   ```
   Follow the on-screen prompts to connect to the server and start chatting.

## Encryption Details

This application uses a symmetric encryption algorithm to secure messages. Each client shares a secret key with the server, which is used to encrypt and decrypt messages. Future enhancements may include implementing asymmetric encryption for key exchange.

## Contributing

Contributions are welcome! To contribute:

1. **Fork the Repository**.
2. **Create a New Branch**:
   ```bash
   git checkout -b feature-name
   ```
3. **Make Your Changes**.
4. **Commit Your Changes**:
   ```bash
   git commit -m "Description of changes"
   ```
5. **Push to the Branch**:
   ```bash
   git push origin feature-name
   ```
6. **Open a Pull Request**.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or suggestions, please open an issue in this repository.

