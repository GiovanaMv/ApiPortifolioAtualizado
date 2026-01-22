package portifolio.atualizado.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import portifolio.atualizado.model.Contato;
import portifolio.atualizado.model.Experiencia;
import portifolio.atualizado.model.Formacao;
import portifolio.atualizado.model.Habilidade;
import portifolio.atualizado.model.Perfil;
import portifolio.atualizado.model.Sites;

@RestController
public class PerfilController {

    @GetMapping("/curriculo/tecnologia")
public ResponseEntity<Resource> baixarTecnologia() throws IOException {
    Resource resource = new ClassPathResource("pdfs/Giovana Tecnologia.pdf");
    return ResponseEntity.ok()
            .header("Content-Type", "application/pdf")
            .header("Content-Disposition", "attachment; filename=Giovana-Tecnologia.pdf")
            .body(resource);
}

@GetMapping("/curriculo/saude")
    public ResponseEntity<Resource> baixarSaude() throws IOException {
        Resource resource = new ClassPathResource("pdfs/Giovana Saúde.pdf");
        return ResponseEntity.ok()
                .header("Content-Type", "application/pdf")
                .header("Content-Disposition", "attachment; filename=Giovana-Saúde.pdf")
                .body(resource);
    }

    @GetMapping("/perfil")
    public Perfil getPerfil() {
        Perfil perfil = new Perfil();
        perfil.setNome("Giovana Maia");
        perfil.setDescricao("Estudante de Engenharia de Software apaixonada por tecnologia, ciência e criatividade. Tem grande interesse pela área da saúde, especialmente em biologia, química e ambientes laboratoriais. Desenvolve soluções em Front-end, APIs com Java e Spring Boot, além de projetos voltados para jogos digitais. Está em constante aprendizado, aprofundando seus estudos em Java e Python. Nas horas vagas, explora a arte por meio da pintura e outras atividades criativas.");

        // Contato
        List <Contato> contatos = Arrays.asList(
        new Contato(1, "Whatsapp", "https://wa.me/5592982479755"),
        new Contato(2, "Instagram", "https://www.instagram.com/giovana_mav"),
        new Contato(3, "Email", "mailto:maiagiovana644@gmail.com"),
        new Contato(4, "LinkedIn", "https://www.linkedin.com/in/giovana-maia1212")
        );
        perfil.setContatos(contatos);

        // // Sites e Jogos
        List<Sites> sites = Arrays.asList(
            new Sites (1, "Cachorro", "https://furry-facts.vercel.app" ),
            new Sites (2, "Signos", "https://signos-angular.vercel.app"),
            new Sites (3, "Books", "https://mini-books-eta.vercel.app")
        );
        perfil.setSites(sites);
        
        perfil.setJogos(List.of("https://menu-mini-jogos.vercel.app"));

        // Experiências Saúde
        List<Experiencia> experienciasSaude = Arrays.asList(
            new Experiencia(1L, "Fórmulas da Amazônia", "Auxiliar de Laboratório (Sólidos)", "2024"),
            new Experiencia(2L, "Laboratório AMAZONLIFE Medicina Ocupacional", "Técnico de Análise Clínica", "2023"),
            new Experiencia(3L, "Pague Menos S.A", "Jovem Aprendiz (Auxiliar administrativo e financeiro)", "2018/2019")
        );

        // Experiências Tecnologia
        List<Experiencia> experienciasTecnologia = Arrays.asList(
            new Experiencia(4L, "TopPrime Seguros e Saúde", "Social Midia", "2025")
        );

        perfil.setExperienciasSaude(experienciasSaude);
        perfil.setExperienciasTecnologia(experienciasTecnologia);

        // Formações Saúde
        List<Formacao> formacoesSaude = Arrays.asList(
            new Formacao(1, "EDUCAC Brasil", Arrays.asList("Fórmulas Magistrais"), "2024"),
            new Formacao(2, "Centro de Ensino Literatus", Arrays.asList("Técnico de Análise Clínica"), "2023"),
            new Formacao(3, "Cetess Instituto Educacional", Arrays.asList("Imunologia Clínica Laboratorial", "Urinálise e Fisiologia Renal"), "2022")
        );

        // Formações Tecnologia
        List<Formacao> formacoesTecnologia = Arrays.asList(
            new Formacao(4, "UDEMY", Arrays.asList("Java (cursando)", "Python (cursando)"), "2026"),
            new Formacao(5, "Faculdade UNIAMÉRICA Centro Universitário", Arrays.asList("Engenharia de Software (cursando)"), "2025"),
            new Formacao(6, "Escola Britânica de Artes Criativas e Tecnologia EBAC", Arrays.asList("Engenharia de Front-End", "Figma"), "2024")
        );

        perfil.setFormacoesSaude(formacoesSaude);
        perfil.setFormacoesTecnologia(formacoesTecnologia);

        // Habilidades Técnicas
        List<Habilidade> habilidades = Arrays.asList(
            new Habilidade(1, "Linguagens:", Arrays.asList("Java(8/17/21)", "JavaScript", "HTML5 (semântico)", "CSS3", "SASS")),
            new Habilidade(2, "Frameworks & Libraries:", Arrays.asList("Spring Boot", "Angular", "React", "Vue.js")),
            new Habilidade(3, "APIs:", Arrays.asList("REST / RESTful", "Integração front-end com back-end", "JSON", "Axios / Fetch")),
            new Habilidade(4, "Arquitetura e Padrões:", Arrays.asList("MVC")),
            new Habilidade(5, "Ferramentas & Design:", Arrays.asList("Figma", "Canva", "Trello", "Meta Business")),
            new Habilidade(6, "Testes:", Arrays.asList("Jest", "Cypress (E2E)", "Playwright")),
            new Habilidade(7, "Controle de versão:", Arrays.asList("Git", "GitHub")),
            new Habilidade(8, "Banco de dados:", Arrays.asList("SQL", "PostgreSQL")),
            new Habilidade(9, "DevOps:", Arrays.asList("Docker", "Maven")),
            new Habilidade(10, "Deploy & Hosting:", Arrays.asList("Render", "Railway", "Vercel"))
        );

        perfil.setHabilidadesTecnicas(habilidades);
        
        return perfil;
    }
}