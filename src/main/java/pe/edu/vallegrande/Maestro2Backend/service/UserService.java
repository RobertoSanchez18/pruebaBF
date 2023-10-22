package pe.edu.vallegrande.Maestro2Backend.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.Maestro2Backend.model.entity.User;
import pe.edu.vallegrande.Maestro2Backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public void delete(Long id) {
        userRepository.deleteUser(id);
    }

    @Transactional
    public User update(Long id, User updatedUser) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();
            existingUser.setName(updatedUser.getName());
            existingUser.setSurname(updatedUser.getSurname());
            existingUser.setTipoDocumento(updatedUser.getTipoDocumento());
            existingUser.setNumeroDocumento(updatedUser.getNumeroDocumento());
            existingUser.setCelphone(updatedUser.getCelphone());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setTipoUsuario(updatedUser.getTipoUsuario());
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("Usuario no encontrado con el ID: " + id);
        }
    }

}
