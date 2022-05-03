package kz.dar.academy.backend.service.send;

import kz.dar.academy.backend.model.TaskDTO;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService {

    @Override
    public void send(TaskDTO taskDTO) {
        System.out.println(taskDTO);
    }
}
