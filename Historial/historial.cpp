#include <iostream>
#include <vector>
#include <string>
#include <ctime>
#include <sstream>

using namespace std;

class PaginaWeb {
public:
    string nombre;
    string ruta;
    time_t horaVisita;
    vector<unsigned char> icono;
    time_t horaCierre;
    string dispositivo;

    PaginaWeb(string nombre, string ruta, time_t horaVisita, vector<unsigned char> icono, time_t horaCierre, string dispositivo) {
        this->nombre = nombre;
        this->ruta = ruta;
        this->horaVisita = horaVisita;
        this->icono = icono;
        this->horaCierre = horaCierre;
        this->dispositivo = dispositivo;
    }

   string toString() {
    stringstream ss;
    ss << "PaginaWeb{nombre=" << nombre << ", ruta=" << ruta << ", horaVisita=" << horaVisita << ", icono=" << convertVectorToString(icono) << ", horaCierre=" << horaCierre << ", dispositivo=" << dispositivo << "}";
    return ss.str();
}

string convertVectorToString(const vector<unsigned char>& vec) {
    stringstream ss;
    for (size_t i = 0; i < vec.size(); i++) {
        ss << static_cast<int>(vec[i]) << " ";
    }
    return ss.str();
}
};

class GestorHistorial {
private:
    vector<PaginaWeb> historial;

public:
    void visitarWeb(PaginaWeb paginaWeb) {
        historial.push_back(paginaWeb);
    }

    PaginaWeb obtenerUltimaWebVisitada() {
        if (historial.empty()) {
            return PaginaWeb("", "", 0, vector<unsigned char>(), 0, "");
        }
        return historial.back();
    }

    void cerrarWeb() {
        if (!historial.empty()) {
            PaginaWeb& ultimaPagina = historial.back();
            ultimaPagina.horaCierre = time(NULL);
        }
    }

    void eliminarWeb() {
        if (!historial.empty()) {
            historial.pop_back();
        }
    }

    PaginaWeb obtenerUltimaWebVisitadaDispositivo(string dispositivo) {
        for (int i = historial.size() - 1; i >= 0; i--) {
            if (historial[i].dispositivo == dispositivo) {
                return historial[i];
            }
        }
        return PaginaWeb("", "", 0, vector<unsigned char>(), 0, "");
    }

  void mostrarHistorial() {
    for (size_t i = 0; i < historial.size(); i++) {
         PaginaWeb pagina = historial[i];
        cout << pagina.toString() << endl;
    }
}
};

int main() {
    GestorHistorial gestor;
    for (int i = 0; i < 3; i++) {
        cout << "Ingresa el nombre de la web: ";
        string nombre;
        getline(cin, nombre);
        cout << "Ingrese dirección de la web: ";
        string direccion;
        getline(cin, direccion);
        cout << "Desde qué dispositivo ingresas: ";
        string dispositivo;
        getline(cin, dispositivo);
        gestor.visitarWeb(PaginaWeb(nombre, direccion, time(NULL), vector<unsigned char>(), 0, dispositivo));
    }

    gestor.mostrarHistorial();
    cout << "--------------------------" << endl;
    cout << gestor.obtenerUltimaWebVisitada().toString() << endl;
    gestor.cerrarWeb();
    cout << gestor.obtenerUltimaWebVisitada().toString() << endl;
    gestor.eliminarWeb();
    cout << gestor.obtenerUltimaWebVisitada().toString() << endl;

    cout << "--------------------------" << endl;
    cout << "Ingrese dispositivo: ";
    string dis;
    getline(cin, dis);
    cout << gestor.obtenerUltimaWebVisitadaDispositivo(dis).toString() << endl;
	return 0;
	}

