![UEB](https://artemisa.unbosque.edu.co/serviciosacademicos/consulta/educacioncontinuada/certificadodiploma/assets/imgs/logoUniversidadElBosque.png)
# Human Resources Full Stack App
## About the project
This is a repository for a generic full stack application that allows the user to communicate with a server storing information about potential candidates for an unnamed company. It is based on Java, and was developed using the Eclipse IDE by Natalia, Juan and Alejandra, students from El Bosque University in Bogotá, Colombia.
## Requirements
To run the software, it is necessary to have installed a Java-supported IDE. We recommend using Eclipse, as it is the one where this app was developed.
## Usage
This repository contains two Java projects: HumanResourcesClient and HumanResourcesServer. You should **first** run the *Server* project, and afterwards, run the Client project, to ensure a smooth deployment of the program. 

The Client project will greet you with a GUI, containing fields where the user will input the information of each candidate, as shown below.

![GUI](https://imagizer.imageshack.com/v2/711x476q90/r/924/4Gm4b7.jpg)

Once this client is run, it will connect to the Server, created in the HumanResourcesServerProject once it is run.

![Connect](https://imagizer.imageshack.com/v2/707x222q90/r/923/bPEHSt.jpg)

If the connection was succesful, using the CRUD buttons on the GUI window, it is possible to send and receive data between client and server. Otherwise, a "Connection refused" error message will appear in the Server's console.

## License

This repository is licensed under the GNU General Public License. Read LICENSE.md for further information.

## Developing Team
* [Juan Diego Valderrama](https://github.com/sseuriracha)
* [Alejandra Valero](https://github.com/ArekuInBlueee)
* [Natalia Vergara](https://github.com/NatVerB)
* [Diego Rodríguez](https://github.com/roca12) - *Supervising professor*

