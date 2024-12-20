-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2024 a las 00:57:20
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario_xiaomi`
--
CREATE DATABASE IF NOT EXISTS `inventario_xiaomi` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `inventario_xiaomi`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `id_adm` int(11) NOT NULL,
  `nom_adm` varchar(35) NOT NULL,
  `ape_adm` varchar(35) NOT NULL,
  `id_usu` int(11) NOT NULL,
  `id_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `administradores`:
--   `id_usu`
--       `usuarios` -> `id_usu`
--   `id_tien`
--       `tiendas` -> `id_tien`
--

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`id_adm`, `nom_adm`, `ape_adm`, `id_usu`, `id_tien`) VALUES
(1, 'Jose', 'Torres', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id_emp` int(11) NOT NULL,
  `nom_emp` varchar(35) NOT NULL,
  `ape_emp` varchar(35) NOT NULL,
  `id_usu` int(11) NOT NULL,
  `id_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `empleados`:
--   `id_usu`
--       `usuarios` -> `id_usu`
--   `id_tien`
--       `tiendas` -> `id_tien`
--

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id_emp`, `nom_emp`, `ape_emp`, `id_usu`, `id_tien`) VALUES
(1, 'Juan', 'Sanchez', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `id_ped` int(11) NOT NULL,
  `cant_ped` int(11) NOT NULL,
  `fec_ped` date NOT NULL,
  `id_prove` int(11) NOT NULL,
  `id_tien` int(11) NOT NULL,
  `id_adm` int(11) NOT NULL,
  `id_pro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `pedidos`:
--   `id_adm`
--       `administradores` -> `id_adm`
--   `id_prove`
--       `proveedores` -> `id_prove`
--   `id_tien`
--       `tiendas` -> `id_tien`
--   `id_pro`
--       `productos` -> `id_pro`
--

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`id_ped`, `cant_ped`, `fec_ped`, `id_prove`, `id_tien`, `id_adm`, `id_pro`) VALUES
(1, 10, '2024-09-04', 3, 1, 1, 4),
(2, 25, '2024-09-25', 3, 2, 1, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_pro` int(11) NOT NULL,
  `nom_pro` varchar(35) NOT NULL,
  `cat_pro` varchar(35) NOT NULL,
  `pre_pro` double NOT NULL,
  `cant_pro` int(11) NOT NULL,
  `est_pro` varchar(30) NOT NULL,
  `id_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `productos`:
--   `id_tien`
--       `tiendas` -> `id_tien`
--

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_pro`, `nom_pro`, `cat_pro`, `pre_pro`, `cant_pro`, `est_pro`, `id_tien`) VALUES
(1, 'Xiaomi Redmi Note 12', 'media', 799.9, 50, 'con stock', 1),
(2, 'Xiaomi 12T Pro', 'alta', 1599.9, 30, 'con stock', 1),
(3, 'Xiaomi Mi 11 Lite', 'media', 999.9, 40, 'con stock', 1),
(4, 'Xiaomi Redmi 9A', 'baja', 499.9, 100, 'con stock', 1),
(5, 'Xiaomi Poco X5', 'media', 899.9, 60, 'con stock', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `id_prove` int(11) NOT NULL,
  `nom_prove` varchar(35) NOT NULL,
  `anio_prove` int(11) NOT NULL,
  `id_pro` int(11) NOT NULL,
  `id_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `proveedores`:
--   `id_pro`
--       `productos` -> `id_pro`
--   `id_tien`
--       `tiendas` -> `id_tien`
--

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id_prove`, `nom_prove`, `anio_prove`, `id_pro`, `id_tien`) VALUES
(1, 'XiaomiPeru', 2019, 1, 1),
(2, 'Globomatik', 2021, 2, 3),
(3, 'Intcomex', 2018, 5, 3),
(4, 'Solutek', 2023, 4, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiendas`
--

CREATE TABLE `tiendas` (
  `id_tien` int(11) NOT NULL,
  `nom_tien` varchar(35) NOT NULL,
  `dir_tien` varchar(50) NOT NULL,
  `tel_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `tiendas`:
--

--
-- Volcado de datos para la tabla `tiendas`
--

INSERT INTO `tiendas` (`id_tien`, `nom_tien`, `dir_tien`, `tel_tien`) VALUES
(1, 'Surco', 'Calle Begonias 135', 789753159),
(2, 'La Molina', 'Av. Independencia 785', 159852456),
(3, 'San Borja', 'Av. Aviacion 326', 123741963);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usu` int(11) NOT NULL,
  `nom_usu` varchar(35) NOT NULL,
  `cont_usu` varchar(35) NOT NULL,
  `rol_usu` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- RELACIONES PARA LA TABLA `usuarios`:
--

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usu`, `nom_usu`, `cont_usu`, `rol_usu`) VALUES
(1, 'empleado', '123', 'emple'),
(2, 'administrador', '456', 'admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`id_adm`),
  ADD KEY `id_usu` (`id_usu`),
  ADD KEY `id_tien` (`id_tien`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id_emp`),
  ADD KEY `id_usu` (`id_usu`),
  ADD KEY `id_tien` (`id_tien`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`id_ped`),
  ADD KEY `id_prove` (`id_prove`),
  ADD KEY `id_tien` (`id_tien`),
  ADD KEY `id_adm` (`id_adm`),
  ADD KEY `id_pro` (`id_pro`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_pro`),
  ADD KEY `id_tien` (`id_tien`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`id_prove`),
  ADD KEY `id_pro` (`id_pro`),
  ADD KEY `id_tien` (`id_tien`);

--
-- Indices de la tabla `tiendas`
--
ALTER TABLE `tiendas`
  ADD PRIMARY KEY (`id_tien`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usu`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administradores`
--
ALTER TABLE `administradores`
  MODIFY `id_adm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id_emp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `id_ped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_pro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `id_prove` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tiendas`
--
ALTER TABLE `tiendas`
  MODIFY `id_tien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD CONSTRAINT `administradores_ibfk_1` FOREIGN KEY (`id_usu`) REFERENCES `usuarios` (`id_usu`),
  ADD CONSTRAINT `administradores_ibfk_2` FOREIGN KEY (`id_tien`) REFERENCES `tiendas` (`id_tien`);

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`id_usu`) REFERENCES `usuarios` (`id_usu`),
  ADD CONSTRAINT `empleados_ibfk_2` FOREIGN KEY (`id_tien`) REFERENCES `tiendas` (`id_tien`);

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`id_adm`) REFERENCES `administradores` (`id_adm`),
  ADD CONSTRAINT `pedidos_ibfk_2` FOREIGN KEY (`id_prove`) REFERENCES `proveedores` (`id_prove`),
  ADD CONSTRAINT `pedidos_ibfk_3` FOREIGN KEY (`id_tien`) REFERENCES `tiendas` (`id_tien`),
  ADD CONSTRAINT `pedidos_ibfk_4` FOREIGN KEY (`id_pro`) REFERENCES `productos` (`id_pro`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`id_tien`) REFERENCES `tiendas` (`id_tien`);

--
-- Filtros para la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD CONSTRAINT `proveedores_ibfk_1` FOREIGN KEY (`id_pro`) REFERENCES `productos` (`id_pro`),
  ADD CONSTRAINT `proveedores_ibfk_2` FOREIGN KEY (`id_tien`) REFERENCES `tiendas` (`id_tien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
