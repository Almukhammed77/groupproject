import controllers.DoctorController;
import controllers.PatientController;
import controllers.AppointmentController;
import repositories.DoctorRepository;
import repositories.PatientRepository;
import repositories.AppointmentRepository;

public class Main {
    public static void main(String[] args) {
        DoctorRepository doctorRepo = new DoctorRepository();
        PatientRepository patientRepo = new PatientRepository();
        AppointmentRepository appointmentRepo = new AppointmentRepository();


        DoctorController doctorController = new DoctorController(doctorRepo);
        PatientController patientController = new PatientController(patientRepo);
        AppointmentController appointmentController = new AppointmentController(appointmentRepo);


        System.out.println("=== Doctors ===");
        System.out.println(doctorController.createDoctor("Aidar Sunkar", "Cardiology"));
        System.out.println(doctorController.createDoctor("Daniyar Zhumabek", "Neurology"));

        System.out.println("All doctors:");
        System.out.println(doctorController.getAllDoctors());

        System.out.println("Doctor by ID 1:");
        System.out.println(doctorController.getDoctorById(1));


        System.out.println("\n=== Patients ===");
        System.out.println(patientController.createPatient("Mahmud", "Askarov", 18));
        System.out.println(patientController.createPatient("Aikyn", "Zhappar", 25));

        System.out.println("All patients:");
        System.out.println(patientController.getAllPatients());

        System.out.println("Patient by ID 1:");
        System.out.println(patientController.getPatientById(1));


        System.out.println("\n=== Appointments ===");
        System.out.println(appointmentController.createAppointment(1, 1, "2025-01-23"));
        System.out.println(appointmentController.createAppointment(2, 2, "2025-01-24"));

        System.out.println("All appointments:");
        System.out.println(appointmentController.getAllAppointments());

        System.out.println("Appointment by ID 1:");
        System.out.println(appointmentController.getAppointmentById(1));
    }
}