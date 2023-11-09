#include <iostream>

using namespace std;
using namespace cv;

int main() {
    // Allocate memory for the image
    Mat image = Mat::zeros(Size(640, 480), CV_8UC3);

    // Load the image from file
    image = imread("input.jpg", IMREAD_COLOR);

    // Check if the image is loaded successfully
    if (image.empty()) {
        cout << "Could not open or find the image" << endl;
        return -1;
    }

    // Resize the image
    Mat resized_image;
    Size size(320, 240);
    resize(image, resized_image, size, 0, 0, INTER_LINEAR);

    // Display the original and resized images
    namedWindow("Original Image", WINDOW_NORMAL);
    imshow("Original Image", image);
    namedWindow("Resized Image", WINDOW_NORMAL);
    imshow("Resized Image", resized_image);
    waitKey(0);

    // De-allocate the memory
    image.release();
    resized_image.release();

    return 0;
}
