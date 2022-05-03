package kz.dar.academy.backend.service.message;

import kz.dar.academy.backend.model.TaskDTO;

public interface ConsumeService {
    void consumeMessage(TaskDTO message);
}
