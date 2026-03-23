CREATE TABLE IF NOT EXISTS Usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    tipo VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS Podcast (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    produtor VARCHAR(50),
    nomeEpisodio VARCHAR(100),
    numeroEpisodio INT,
    duracao VARCHAR(20),
    url VARCHAR(200)
);
INSERT INTO Usuario (login, senha, tipo) VALUES 
('admin', '123', 'Administrador'),
('operador', '123', 'Operador'),
('usuario', '123', 'Usuário');