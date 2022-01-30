import json

modname = "excessive_realism"
assetpath = "assets/" + modname + "/"
datapath = "data/" + modname + "/"

def writeJSON(name, type):
    writeItemModelJSON(name)
    writeLootTableJSON(name)
    writeBlockstateJSON(name)
    if(type == "cube_all"):
        writeBlockModelJSONCubeAll(name)
    elif( type == "cube_top"):
        writeBlockModelJSONCubeTop(name)
    else:
        print("Invalid Block Type")


def writeBlockModelJSONCubeAll(name):
    data = {
                "parent": "minecraft:block/cube_all",
                "textures": {
                    "all": modname + ":block/" + name
                }
            }
    path = './' + assetpath + 'models/block/' + name + '.json'
    with open(path, 'w') as fp:
        json.dump(data, fp, indent = 2)

def writeBlockModelJSONCubeTop(name):
    data = {
                "parent": "minecraft:block/cube_bottom_top",
                "textures": {
                    "top": modname + ":block/" + name + "_top",
                    "bottom": modname + ":block/" + name,
                    "side": modname + ":block/" + name
                }
            }
    path = './' + assetpath + 'models/block/' + name + '.json'
    with open(path, 'w') as fp:
        json.dump(data, fp, indent = 2)

def writeItemModelJSON(name):
    data = {
                "parent": modname + ":block/" + name
            }
    path = './' + assetpath + 'models/item/' + name + '.json'
    with open(path, 'w') as fp:
        json.dump(data, fp, indent = 2)

def writeBlockstateJSON(name):
    data = {
              "variants": {
                "": { "model": modname + ":block/" + name }
              }
            }
    path = './' + assetpath + 'blockstates/' + name + '.json'
    with open(path, 'w') as fp:
        json.dump(data, fp, indent = 2)

def writeLootTableJSON(name):
    data = {
              "type": "minecraft:block",
              "pools": [
                {
                  "rolls": 1,
                  "entries": [
                    {
                      "type": "minecraft:item",
                      "name": modname + ":" + name
                    }
                  ]
                }
              ]
            }
    path = './' + datapath + 'loot_tables/blocks/' + name + '.json'
    with open(path, 'w') as fp:
        json.dump(data, fp, indent = 2)

writeJSON("meteoric_iron", "cube_all")
