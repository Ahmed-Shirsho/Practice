-- Create the app_user table (used by User entity)
CREATE TABLE IF NOT EXISTS app_user (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);

-- Insert a sample teacher
INSERT INTO app_user (id, username, password, role)
VALUES (1, 'teacher1', '$2a$10$7QmQrFQmQkN2Kb/8RdjE/u9HMEzhxsQ7RaFnyzLLy.s5mCYeXk.9O', 'ROLE_TEACHER');
-- password: teacher123

-- Create the teacher table
CREATE TABLE IF NOT EXISTS teacher (
    id BIGINT PRIMARY KEY,
    teacher_data VARCHAR(255),
    FOREIGN KEY (id) REFERENCES app_user(id) ON DELETE CASCADE
);

-- Insert sample teacher data
INSERT INTO teacher (id, teacher_data)
VALUES (1, 'This is teacher 1 data.');

-- Insert sample students
INSERT INTO app_user (id, username, password, role)
VALUES (2, 'student1', '$2a$10$CjFj3b/DckOsGPJ47T0DCODuIcOuM4Fj9SuP8C5CNr/uS0BlxgCee', 'ROLE_STUDENT');
-- password: student123

INSERT INTO app_user (id, username, password, role)
VALUES (3, 'student2', '$2a$10$t5fnBaNd2D0cg7XOcTDJ6OpePCE.yWSPouLPcX8YUi8Gq.hWuTmnG', 'ROLE_STUDENT');
-- password: student123

-- Create the student table
CREATE TABLE IF NOT EXISTS student (
    id BIGINT PRIMARY KEY,
    student_data VARCHAR(255),
    FOREIGN KEY (id) REFERENCES app_user(id) ON DELETE CASCADE
);

-- Insert sample student data
INSERT INTO student (id, student_data)
VALUES (2, 'This is student 1 data.');

INSERT INTO student (id, student_data)
VALUES (3, 'This is student 2 data.');
