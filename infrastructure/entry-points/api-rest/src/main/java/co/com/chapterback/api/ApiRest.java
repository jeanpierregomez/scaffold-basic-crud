package co.com.chapterback.api;
import co.com.chapterback.model.user.User;
import co.com.chapterback.usecase.user.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final UserUseCase userUseCase;

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") String id) {
        return ResponseEntity.ok(userUseCase.getUser(id));
    }

    @PostMapping(path = "/")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userUseCase.saveUser(user));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {
        userUseCase.deleteUser(id);
        return ResponseEntity.ok("Usuario eliminado exitosamente");
    }

    @PutMapping(path = "/")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return ResponseEntity.ok(userUseCase.updateUser(user));
    }
}
