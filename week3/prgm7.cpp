#include <iostream>
#include <fstream>
#include <string>
#include <vector>

int main() {
    std::string file_name;
    std::cout << "Enter the name of the text file: ";
    std::cin >> file_name;

    std::ifstream file(file_name);
    if (!file.is_open()) {
        std::cerr << "Unable to open file '" << file_name << "'." << std::endl;
        return 1;
    }

    std::vector<std::string> lines;
    std::string line;
    while (std::getline(file, line)) {
        lines.push_back(line);
    }

    std::cout << "Content of the file with line numbers:" << std::endl;
    for (size_t line_number = 0; line_number < lines.size(); ++line_number) {
        std::cout << line_number + 1 << ": " << lines[line_number] << std::endl;
    }

    return 0;
}

