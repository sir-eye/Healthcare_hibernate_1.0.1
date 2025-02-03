package healthcare.service;

import healthcare.model.Office;
import healthcare.repository.OfficeRepositoryImpl;

import java.util.List;

public class OfficeService {

    private final OfficeRepositoryImpl officeRepository;

    public OfficeService(OfficeRepositoryImpl officeRepository) {
        this.officeRepository = officeRepository;
    }

    public void createOffice(Office office) {
        if (office.getLocation() == null || office.getPhone() == null) {
            throw new IllegalArgumentException("Office location and phone cannot be null");
        }
        officeRepository.createOffice(office);
    }

    public Office getOfficeById(int officeId) {
        return officeRepository.getOfficeById(officeId);
    }

    public void updateOffice(Office office) {
        officeRepository.updateOffice(office);
    }

    public void deleteOffice(int officeId) {
        officeRepository.deleteOffice(officeId);
    }

    public List<Office> getAllOffices() {
        return officeRepository.getAllOffices();
    }
}