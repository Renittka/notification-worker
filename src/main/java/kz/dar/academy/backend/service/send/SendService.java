package kz.dar.academy.backend.service.send;

import kz.dar.academy.backend.model.TaskDTO;

public interface SendService {
    void send(TaskDTO taskDTO);
}
