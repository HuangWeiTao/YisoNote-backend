package YisoNote.common.helper;

import YisoNote.note.model.Folder;
import YisoNote.note.model.Note;
import YisoNote.note.viewModel.FolderView;
import YisoNote.note.viewModel.NoteAddModel;
import YisoNote.note.viewModel.NoteEditModel;
import YisoNote.note.viewModel.NoteView;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ken on 2016/9/11.
 */
public class ModelMapperHelper {
     private static final ModelMapper mapper;
     static {
          mapper = new ModelMapper();

          Configure();
     }

     private static void Configure(){

          ConfigureFolder();

          ConfigureNote();
     }

     private static void ConfigureFolder(){

          PropertyMap<Folder, FolderView> mapFrom = new PropertyMap<Folder, FolderView>() {
               @Override
               protected void configure() {
                    map().setUpdateTime(source.getUpdateTime());
                    map().setCreateTime(source.getCreateTime());
                    map().setDescription(source.getDescription());
                    map().setName(source.getName());
                    map().setId(source.getId());
                    map().setParentFolderId(source.getParentFolder());
               }
          };
          mapper.addMappings(mapFrom);
     }

     private static void ConfigureNote(){

          PropertyMap<Note, NoteView> mapView = new PropertyMap<Note, NoteView>() {
               @Override
               protected void configure() {
                    map().setDescription(source.getDescription());
                    map().setName(source.getName());
                    map().setId(source.getId());
                    map().setCreateTime(source.getCreateTime());
               }
          };

          mapper.addMappings(mapView);

          PropertyMap<NoteAddModel, Note> mapAdd = new PropertyMap<NoteAddModel, Note>() {
               @Override
               protected void configure() {
                    map().setDescription(source.getDescription());
                    map().setFolderId(source.getFolderId());
                    map().setName(source.getName());
               }
          };

          mapper.addMappings(mapAdd);

          PropertyMap<NoteEditModel, Note> mapEdit = new PropertyMap<NoteEditModel, Note>() {
               @Override
               protected void configure() {
                    map().setFolderId(source.getFolderId());
                    map().setId(source.getId());
                    map().setName(source.getName());
                    map().setDescription(source.getDescription());
                    map().setUpdateTime(new Date());
               }
          };

          mapper.addMappings(mapEdit);
     }

     public static ModelMapper GetMapper(){
          return mapper;
     }

    //有问题
//    public static <S,T> List<T> Map(List<S> source, Class<?> sourceCls, Class<?> targetCls) {
//         return (List<T>)source.stream().map(model -> GetMapper().map(model, targetCls)).collect(Collectors.toList());
//    }
}
