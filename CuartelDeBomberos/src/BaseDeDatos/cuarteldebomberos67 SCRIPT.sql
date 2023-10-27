-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 00:36:37
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
-- Base de datos: `cuarteldebomberos67`
--
CREATE DATABASE IF NOT EXISTS `cuarteldebomberos67` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cuarteldebomberos67`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `fecha_nac` date NOT NULL,
  `celular` varchar(15) NOT NULL,
  `cod_brigada` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `grupoSanguineo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre`, `apellido`, `fecha_nac`, `celular`, `cod_brigada`, `estado`, `grupoSanguineo`) VALUES
(1, '41356985', 'Pedro', 'Perez', '1998-10-12', '3417536958', 1, 1, 'A+'),
(2, '40253565', 'Armando Esteban', 'Quito', '1990-10-08', '11568957532', 2, 1, 'O+'),
(3, '37652653', 'Hernan', 'Zuchetto', '1990-07-04', '1156893265', 3, 1, 'AB+'),
(4, '40356598', 'Ezequiel', 'De Paula', '1995-10-05', '341596852', 1, 1, 'A-'),
(5, '37526485', 'Juan Cruz', 'Yanson', '1995-10-02', '3415689653', 1, 1, 'A+'),
(6, '43562843', 'Marcelo', 'Fabiani', '1996-05-21', '115689567', 1, 1, 'AB-');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `cod_brigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` int(11) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nro_cuartel` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `cant_bomberos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`cod_brigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`, `estado`, `cant_bomberos`) VALUES
(1, 'Brigada Atalaya', 1, 1, 1, 1, 4),
(2, 'Brigada Temperley', 2, 0, 2, 1, 1),
(3, 'Brigada Provincial', 3, 0, 3, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `cod_cuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `cod_x` int(11) NOT NULL,
  `cod_y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`cod_cuartel`, `nombre_cuartel`, `direccion`, `cod_x`, `cod_y`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel Rosario', 'La Paz 156', 1955, 3366, '3417195688', 'cuartelrosario@gmail.com', 1),
(2, 'Cuartel Buenos Aires', 'Av Avellaneda 666', 553, 552, '115698855', 'cuartelba@gmail.com', 1),
(3, 'Cuartel Mendoza', 'Ayolas 1233', 221, 922, '2944129222', 'cuartelmendoza@gmail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emergencia`
--

CREATE TABLE `emergencia` (
  `idEmergencia` int(11) NOT NULL,
  `emergencia` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `emergencia`
--

INSERT INTO `emergencia` (`idEmergencia`, `emergencia`) VALUES
(1, 'Incendios en vivienda e industria'),
(2, 'Salvamentos de derrumbe'),
(3, 'Rescate en ámbito de montaña'),
(4, 'Rescate de personas atrapadas en accidentes de tráfico'),
(5, 'Socorrer inundaciones'),
(6, 'Operativos de prevención');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `cod_x` int(11) NOT NULL,
  `cod_y` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `fecha_resol` date DEFAULT NULL,
  `puntuacion` int(11) DEFAULT NULL,
  `cod_brigada` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `cod_x`, `cod_y`, `detalle`, `fecha_resol`, `puntuacion`, `cod_brigada`, `estado`) VALUES
(1, '1', '2023-10-31', 126, 126, 'Incendio en casa de pasillo', NULL, NULL, 2, 1),
(2, '1', '2023-10-31', 955, 1295, 'Persona atrapada bajo arbol', NULL, NULL, 3, 1),
(3, '2', '2023-11-01', 123, 123, 'Derrumbe en casa 3 heridos', NULL, NULL, 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `cod_brigada` (`cod_brigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`cod_brigada`),
  ADD KEY `nro_cuartel` (`nro_cuartel`),
  ADD KEY `especialidad` (`especialidad`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`cod_cuartel`);

--
-- Indices de la tabla `emergencia`
--
ALTER TABLE `emergencia`
  ADD PRIMARY KEY (`idEmergencia`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `cod_brigada` (`cod_brigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `cod_brigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `cod_cuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `emergencia`
--
ALTER TABLE `emergencia`
  MODIFY `idEmergencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`cod_brigada`) REFERENCES `brigada` (`cod_brigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`nro_cuartel`) REFERENCES `cuartel` (`cod_cuartel`),
  ADD CONSTRAINT `brigada_ibfk_2` FOREIGN KEY (`especialidad`) REFERENCES `emergencia` (`idEmergencia`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`cod_brigada`) REFERENCES `brigada` (`cod_brigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
