CREATE DATABASE global_tshirts;

USE global_tshirts;

CREATE TABLE inventory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(50),
    size VARCHAR(10),
    color VARCHAR(30),
    stock INT,
    sales FLOAT
);

INSERT INTO inventory (brand, size, color, stock, sales) VALUES
('Adidas', 'M', 'White', 50, 1200.50),
('Nike', 'XS', 'Black', 30, 800.00),
('Levi\'s', 'L', 'Blue', 100, 3000.75);
